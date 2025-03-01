package com.tsysinfo.billing;

/**
 * Created by administrator on 16/5/16.
 */
public class UnicodeFormatter {

    static public String byteToHex(byte b) {
        // Returns hex String representation of byte b
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
        return new String(array);
    }

    static public String charToHex(char c) {
        // Returns hex String representation of char c
        byte hi = (byte) (c >>> 8);
        byte lo = (byte) (c & 0xff);
        return byteToHex(hi) + byteToHex(lo);
    }


    static public String converTextToHex(String text)
    {
        String newText="";
        char[] charArray = text.toCharArray();
        for (char c : charArray)
        {
            switch(c)
            {
                case'й':
                    newText+="_D0_B9";
                    break;
                case'Й':
                    newText+="_D0_99";
                    break;
                case'ц':
                    newText+="_D1_86";
                    break;
                case'Ц':
                    newText+="_D0_A6";
                    break;
                case'у':
                    newText+="_D1_83";
                    break;
                case'У':
                    newText+="_D0_A3";
                    break;
                case'к':
                    newText+="_D0_BA";
                    break;
                case'К':
                    newText+="_D0_9A";
                    break;
                case'е':
                    newText+="_D0_B5";
                    break;
                case'Е':
                    newText+="_D0_95";
                    break;
                case'н':
                    newText+="_D0_BD";
                    break;
                case'Н':
                    newText+="_D0_9D";
                    break;
                case'г':
                    newText+="_D0_B3";
                    break;
                case'Г':
                    newText+="_D0_93";
                    break;
                case'ш':
                    newText+="_D1_88";
                    break;
                case'Ш':
                    newText+="_D0_A8";
                    break;
                case'щ':
                    newText+="_D1_89";
                    break;
                case'Щ':
                    newText+="_D0_A9";
                    break;
                case'з':
                    newText+="_D0_B7";
                    break;
                case'З':
                    newText+="_D0_97";
                    break;
                case'х':
                    newText+="_D1_85";
                    break;
                case'Х':
                    newText+="_D0_A5";
                    break;
                case'ъ':
                    newText+="_D1_8A";
                    break;
                case'Ъ':
                    newText+="_D0_AA";
                    break;
                case'ф':
                    newText+="_D1_84";
                    break;
                case'Ф':
                    newText+="_D0_A4";
                    break;
                case'ы':
                    newText+="_D1_8B";
                    break;
                case'Ы':
                    newText+="_D0_AB";
                    break;
                case'в':
                    newText+="_D0_B2";
                    break;
                case'В':
                    newText+="_D0_92";
                    break;
                case'а':
                    newText+="_D0_B0";
                    break;
                case'А':
                    newText+="_D0_90";
                    break;
                case'п':
                    newText+="_D0_BF";
                    break;
                case'П':
                    newText+="_D0_9F";
                    break;
                case'р':
                    newText+="_D1_80";
                    break;
                case'Р':
                    newText+="_D0_A0";
                    break;
                case'о':
                    newText+="_D0_BE";
                    break;
                case'О':
                    newText+="_D0_9E";
                    break;
                case'л':
                    newText+="_D0_BB";
                    break;
                case'Л':
                    newText+="_D0_9B";
                    break;
                case'д':
                    newText+="_D0_B4";
                    break;
                case'Д':
                    newText+="_D0_94";
                    break;
                case'ж':
                    newText+="_D0_B6";
                    break;
                case'Ж':
                    newText+="_D0_96";
                    break;
                case'э':
                    newText+="_D1_8D";
                    break;
                case'Э':
                    newText+="_D0_AD";
                    break;
                case'я':
                    newText+="_D1_8F";
                    break;
                case'Я':
                    newText+="_D0_AF";
                    break;
                case'ч':
                    newText+="_D1_87";
                    break;
                case'Ч':
                    newText+="_D0_A7";
                    break;
                case'с':
                    newText+="_D1_81";
                    break;
                case'С':
                    newText+="_D0_A1";
                    break;
                case'м':
                    newText+="_D0_BC";
                    break;
                case'М':
                    newText+="_D0_9C";
                    break;
                case'и':
                    newText+="_D0_B8";
                    break;
                case'И':
                    newText+="_D0_98";
                    break;
                case'т':
                    newText+="_D1_82";
                    break;
                case'Т':
                    newText+="_D0_A2";
                    break;
                case'ь':
                    newText+="_D1_8C";
                    break;
                case'Ь':
                    newText+="_D0_AC";
                    break;
                case'б':
                    newText+="_D0_B1";
                    break;
                case'Б':
                    newText+="_D0_91";
                    break;
                case'ю':
                    newText+="_D1_8E";
                    break;
                case'Ю':
                    newText+="_D0_AE";
                    break;
                case'ӑ':
                    newText+="_D3_91";
                    break;
                case'Ӑ':
                    newText+="_D3_90";
                    break;
                case'ӓ':
                    newText+="_D3_93";
                    break;
                case'Ӓ':
                    newText+="_D3_92";
                    break;
                case'ә':
                    newText+="_D3_99";
                    break;
                case'Ә':
                    newText+="_D3_98";
                    break;
                case'ӛ':
                    newText+="_D3_9B";
                    break;
                case'Ӛ':
                    newText+="_D3_9A";
                    break;
                case'ӕ':
                    newText+="_D3_95";
                    break;
                case'Ӕ':
                    newText+="_D3_94";
                    break;
                case'ґ':
                    newText+="_D2_91";
                    break;
                case'Ґ':
                    newText+="_D2_90";
                    break;
                case'ѓ':
                    newText+="_D1_93";
                    break;
                case'Ѓ':
                    newText+="_D0_83";
                    break;
                case'ғ':
                    newText+="_D2_93";
                    break;
                case'Ғ':
                    newText+="_D2_92";
                    break;
                case'ӷ':
                    newText+="_D3_B7";
                    break;
                case'Ӷ':
                    newText+="_D3_B6";
                    break;
                case'ҕ':
                    newText+="_D2_95";
                    break;
                case'Ҕ':
                    newText+="_D2_94";
                    break;
                case'ђ':
                    newText+="_D1_92";
                    break;
                case'Ђ':
                    newText+="_D0_82";
                    break;
                case'ѐ':
                    newText+="_D1_90";
                    break;
                case'Ѐ':
                    newText+="_D0_80";
                    break;
                case'ӗ':
                    newText+="_D3_97";
                    break;
                case'Ӗ':
                    newText+="_D3_96";
                    break;
                case'ҽ':
                    newText+="_D2_BD";
                    break;
                case'Ҽ':
                    newText+="_D2_BC";
                    break;
                case'ҿ':
                    newText+="_D2_BF";
                    break;
                case'Ҿ':
                    newText+="_D2_BE";
                    break;
                case'є':
                    newText+="_D1_94";
                    break;
                case'Є':
                    newText+="_D0_84";
                    break;
                case'ӂ':
                    newText+="_D3_82";
                    break;
                case'Ӂ':
                    newText+="_D3_81";
                    break;
                case'җ':
                    newText+="_D2_97";
                    break;
                case'Җ':
                    newText+="_D2_96";
                    break;
                case'ӝ':
                    newText+="_D3_9D";
                    break;
                case'Ӝ':
                    newText+="_D3_9C";
                    break;
                case'ҙ':
                    newText+="_D2_99";
                    break;
                case'Ҙ':
                    newText+="_D2_98";
                    break;
                case'ӟ':
                    newText+="_D3_9F";
                    break;
                case'Ӟ':
                    newText+="_D3_9E";
                    break;
                case'ӡ':
                    newText+="_D3_A1";
                    break;
                case'Ӡ':
                    newText+="_D3_A0";
                    break;
                case'ѕ':
                    newText+="_D1_95";
                    break;
                case'Ѕ':
                    newText+="_D0_85";
                    break;
                case'ѝ':
                    newText+="_D1_9D";
                    break;
                case'Ѝ':
                    newText+="_D0_8D";
                    break;
                case'ӥ':
                    newText+="_D3_A5";
                    break;
                case'Ӥ':
                    newText+="_D3_A4";
                    break;
                case'ӣ':
                    newText+="_D3_A3";
                    break;
                case'Ӣ':
                    newText+="_D3_A2";
                    break;
                case'і':
                    newText+="_D1_96";
                    break;
                case'І':
                    newText+="_D0_86";
                    break;
                case'ї':
                    newText+="_D1_97";
                    break;
                case'Ї':
                    newText+="_D0_87";
                    break;
                case'Ӏ':
                    newText+="_D3_80";
                    break;
                case'ҋ':
                    newText+="_D2_8B";
                    break;
                case'Ҋ':
                    newText+="_D2_8A";
                    break;
                case'ј':
                    newText+="_D1_98";
                    break;
                case'Ј':
                    newText+="_D0_88";
                    break;
                case'қ':
                    newText+="_D2_9B";
                    break;
                case'Қ':
                    newText+="_D2_9A";
                    break;
                case'ҟ':
                    newText+="_D2_9F";
                    break;
                case'Ҟ':
                    newText+="_D2_9E";
                    break;
                case'ҡ':
                    newText+="_D2_A1";
                    break;
                case'Ҡ':
                    newText+="_D2_A0";
                    break;
                case'ӄ':
                    newText+="_D3_84";
                    break;
                case'Ӄ':
                    newText+="_D3_83";
                    break;
                case'ҝ':
                    newText+="_D2_9D";
                    break;
                case'Ҝ':
                    newText+="_D2_9C";
                    break;
                case'ӆ':
                    newText+="_D3_86";
                    break;
                case'Ӆ':
                    newText+="_D3_85";
                    break;
                case'љ':
                    newText+="_D1_99";
                    break;
                case'Љ':
                    newText+="_D0_89";
                    break;
                case'ӎ':
                    newText+="_D3_8E";
                    break;
                case'Ӎ':
                    newText+="_D3_8D";
                    break;
                case'ӊ':
                    newText+="_D3_8A";
                    break;
                case'Ӊ':
                    newText+="_D3_89";
                    break;
                case'ң':
                    newText+="_D2_A3";
                    break;
                case'Ң':
                    newText+="_D2_A2";
                    break;
                case'ӈ':
                    newText+="_D3_88";
                    break;
                case'Ӈ':
                    newText+="_D3_87";
                    break;
                case'ҥ':
                    newText+="_D2_A5";
                    break;
                case'Ҥ':
                    newText+="_D2_A4";
                    break;
                case'њ':
                    newText+="_D1_9A";
                    break;
                case'Њ':
                    newText+="_D0_8A";
                    break;
                case'ӧ':
                    newText+="_D3_A7";
                    break;
                case'Ӧ':
                    newText+="_D3_A6";
                    break;
                case'ө':
                    newText+="_D3_A9";
                    break;
                case'Ө':
                    newText+="_D3_A8";
                    break;
                case'ӫ':
                    newText+="_D3_AB";
                    break;
                case'Ӫ':
                    newText+="_D3_AA";
                    break;
                case'ҩ':
                    newText+="_D2_A9";
                    break;
                case'Ҩ':
                    newText+="_D2_A8";
                    break;
                case'ҧ':
                    newText+="_D2_A7";
                    break;
                case'Ҧ':
                    newText+="_D2_A6";
                    break;
                case'ҏ':
                    newText+="_D2_8F";
                    break;
                case'Ҏ':
                    newText+="_D2_8E";
                    break;
                case'ҫ':
                    newText+="_D2_AB";
                    break;
                case'Ҫ':
                    newText+="_D2_AA";
                    break;
                case'ҭ':
                    newText+="_D2_AD";
                    break;
                case'Ҭ':
                    newText+="_D2_AC";
                    break;
                case'ћ':
                    newText+="_D1_9B";
                    break;
                case'Ћ':
                    newText+="_D0_8B";
                    break;
                case'ќ':
                    newText+="_D1_9C";
                    break;
                case'Ќ':
                    newText+="_D0_8C";
                    break;
                case'ў':
                    newText+="_D1_9E";
                    break;
                case'Ў':
                    newText+="_D0_8E";
                    break;
                case'ӳ':
                    newText+="_D3_B3";
                    break;
                case'Ӳ':
                    newText+="_D3_B2";
                    break;
                case'ӱ':
                    newText+="_D3_B1";
                    break;
                case'Ӱ':
                    newText+="_D3_B0";
                    break;
                case'ӯ':
                    newText+="_D3_AF";
                    break;
                case'Ӯ':
                    newText+="_D3_AE";
                    break;
                case'ү':
                    newText+="_D2_AF";
                    break;
                case'Ү':
                    newText+="_D2_AE";
                    break;
                case'ұ':
                    newText+="_D2_B1";
                    break;
                case'Ұ':
                    newText+="_D2_B0";
                    break;
                case'ҳ':
                    newText+="_D2_B3";
                    break;
                case'Ҳ':
                    newText+="_D2_B2";
                    break;
                case'һ':
                    newText+="_D2_BB";
                    break;
                case'Һ':
                    newText+="_D2_BA";
                    break;
                case'ҵ':
                    newText+="_D2_B5";
                    break;
                case'Ҵ':
                    newText+="_D2_B4";
                    break;
                case'ӵ':
                    newText+="_D3_B5";
                    break;
                case'Ӵ':
                    newText+="_D3_B4";
                    break;
                case'ҷ':
                    newText+="_D2_B7";
                    break;
                case'Ҷ':
                    newText+="_D2_B6";
                    break;
                case'ӌ':
                    newText+="_D3_8C";
                    break;
                case'Ӌ':
                    newText+="_D3_8B";
                    break;
                case'ҹ':
                    newText+="_D2_B9";
                    break;
                case'Ҹ':
                    newText+="_D2_B8";
                    break;
                case'џ':
                    newText+="_D1_9F";
                    break;
                case'Џ':
                    newText+="_D0_8F";
                    break;
                case'ӹ':
                    newText+="_D3_B9";
                    break;
                case'Ӹ':
                    newText+="_D3_B8";
                    break;
                case'ҍ':
                    newText+="_D2_8D";
                    break;
                case'Ҍ':
                    newText+="_D2_8C";
                    break;
                case'ӭ':
                    newText+="_D3_AD";
                    break;
                case'Ӭ':
                    newText+="_D3_AC";
                    break;
                case'A':
                    newText+="_41";
                    break;
                case'a':
                    newText+="_61";
                    break;
                case'B':
                    newText+="_42";
                    break;
                case'b':
                    newText+="_62";
                    break;
                case'C':
                    newText+="_43";
                    break;
                case'c':
                    newText+="_63";
                    break;
                case'D':
                    newText+="_44";
                    break;
                case'd':
                    newText+="_64";
                    break;
                case'E':
                    newText+="_45";
                    break;
                case'e':
                    newText+="_65";
                    break;
                case'F':
                    newText+="_46";
                    break;
                case'f':
                    newText+="_66";
                    break;
                case'G':
                    newText+="_47";
                    break;
                case'g':
                    newText+="_67";
                    break;
                case'H':
                    newText+="_48";
                    break;
                case'h':
                    newText+="_68";
                    break;
                case'I':
                    newText+="_49";
                    break;
                case'i':
                    newText+="_69";
                    break;
                case'J':
                    newText+="_4A";
                    break;
                case'j':
                    newText+="_6A";
                    break;
                case'K':
                    newText+="_4B";
                    break;
                case'k':
                    newText+="_6B";
                    break;
                case'L':
                    newText+="_4C";
                    break;
                case'l':
                    newText+="_6C";
                    break;
                case'M':
                    newText+="_4D";
                    break;
                case'm':
                    newText+="_6D";
                    break;
                case'N':
                    newText+="_4E";
                    break;
                case'n':
                    newText+="_6E";
                    break;
                case'O':
                    newText+="_4F";
                    break;
                case'o':
                    newText+="_6F";
                    break;
                case'P':
                    newText+="_50";
                    break;
                case'p':
                    newText+="_70";
                    break;
                case'R':
                    newText+="_52";
                    break;
                case'r':
                    newText+="_72";
                    break;
                case'S':
                    newText+="_53";
                    break;
                case's':
                    newText+="_73";
                    break;
                case'T':
                    newText+="_54";
                    break;
                case't':
                    newText+="_74";
                    break;
                case'U':
                    newText+="_55";
                    break;
                case'u':
                    newText+="_75";
                    break;
                case'V':
                    newText+="_56";
                    break;
                case'v':
                    newText+="_76";
                    break;
                case'Y':
                    newText+="_59";
                    break;
                case'y':
                    newText+="_79";
                    break;
                case'Z':
                    newText+="_5A";
                    break;
                case'z':
                    newText+="_7A";
                    break;
                case' ':
                    newText+=" ";
                    break;
                default:
                    newText+=c;
                    break;
            }
        }
        return newText;
    }


} // class