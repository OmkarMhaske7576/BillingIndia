package com.tsysinfo.billing;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.Toast;

import com.tsysinfo.billing.database.DataBaseAdapter;
import com.tsysinfo.billing.database.Models;

public class GPSTracker extends Service implements LocationListener {
    private final Context mContext;
    // flag for GPS status
    boolean isGPSEnabled = false;
    // flag for network status
    boolean isNetworkEnabled = false;
    // flag for GPS status
    boolean canGetLocation = false;
    Location location; // location
    double latitude; // latitude
    double longitude; // longitude
    // The minimum distance to change Updates in meters
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; // 2 meters
    // The minimum time between updates in milliseconds
    private static final long MIN_TIME_BW_UPDATES = 1000 * 1 * 1; // 5 sec
    // Declaring a Location Manager
    protected LocationManager locationManager;

    DataBaseAdapter dba;
    Models mod;

    public GPSTracker(Context context) {
        this.mContext = context;
        getLocation();

        //References
        dba = new DataBaseAdapter(context);
        mod = new Models();

    }

    @SuppressLint("MissingPermission")
    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);
            // getting GPS status
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            // getting network status
            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!isGPSEnabled && !isNetworkEnabled) {
                // no network provider is enabled
            } else {
                this.canGetLocation = true;
                // First get location from Network Provider
                if (isNetworkEnabled) {
                    locationManager.requestLocationUpdates(
                            LocationManager.NETWORK_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    Log.d("Network", "Network");
                    //Toast.makeText(mContext , "Network Enabled : ", Toast.LENGTH_SHORT).show();
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                            //Toast.makeText(mContext , "Network : " + latitude+ " , " + longitude, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                // if GPS Enabled get lat/long using GPS Services

                if (isGPSEnabled) {
                    if (location == null) {

                        locationManager.requestLocationUpdates(
                                LocationManager.GPS_PROVIDER,
                                MIN_TIME_BW_UPDATES,
                                MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                        Log.d("GPS Enabled", "GPS Enabled");
                        //Toast.makeText(mContext , "GPS Enabled : ", Toast.LENGTH_SHORT).show();
                        if (locationManager != null) {
                            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                           /* location = locationManager
                                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);*/
                            if (location != null) {
                                latitude = location.getLatitude();
                                longitude = location.getLongitude();
                                //Toast.makeText(mContext , "GPS : " + latitude+ " , " + longitude, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            LogError lErr = new LogError();
            lErr.appendLog(e.toString());
        }
        return location;
    }

    /**
     * Stop using GPS listener
     * Calling this function will stop using GPS in your app
     * */
    public void stopUsingGPS() {
        if (locationManager != null) {

            locationManager.removeUpdates(GPSTracker.this);
        }
    }
    /**
     * Function to get latitude
     **/
    public double getLatitude(){
        if(location != null){
            latitude = location.getLatitude();
        }
        // return latitude
        return latitude;
    }
    /**
     * Function to get longitude
     * */
    public double getLongitude(){
        if(location != null){
            longitude = location.getLongitude();
        }
        // return longitude
        return longitude;
    }
    /**
     * Function to check GPS/wifi enabled
     * @return boolean
     * */
    public boolean canGetLocation() {
        return this.canGetLocation;
    }
    /**
     * Function to show settings alert dialog
     * On pressing Settings button will lauch Settings Options
     * */
    public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
        // Setting Dialog Title
        alertDialog.setTitle("GPS settings");
        // Setting Dialog Message
        alertDialog.setMessage("GPS is not enabled. Do you want to go to settings menu?");
        // On pressing Settings button
        alertDialog.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                mContext.startActivity(intent);
            }
        });
        // on pressing cancel button
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        // Showing Alert Message
        alertDialog.show();
    }
    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
        double lat = location.getLatitude();
        double lon = location.getLongitude();

        Log.w("Latitude",String.valueOf(lat));
        Log.w("Longitude",String.valueOf(lon));
       /* if(location != null) {
            Log.w("GPSTracker","currLati :"+location.getLatitude());
            Log.w("GPSTracker","currLongi :"+location.getLongitude());
            Toast.makeText(mContext, "Location changed!\nLongitude: " + location.getLongitude() + "\nLatitude: " + location.getLatitude(),
                    Toast.LENGTH_SHORT).show();
        }*/

    }
    @Override
    public void onProviderDisabled(String provider) {
    }
    @Override
    public void onProviderEnabled(String provider) {

  /*      ToastService toastService = new ToastService(mContext);
        toastService.stopTimer();
*/
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}