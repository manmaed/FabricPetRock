package net.manmaed.petrock.libs;

import java.net.URL;

/**
 * Created by manmaed on 04/12/2018.
 */
public class PRHats {

    public static boolean birthday = false;
    public static boolean christmas = false;
    public static boolean halloween = false;
    public static boolean loneztar = false;
    public static boolean slowpoke = false;
    public static boolean userslow = false;
    public static String usernames = "";

    /*public static void load() {
        HatData hatData = null;
        bday = false;
        christmas = false;
        halloween = false;
        slowpoke = false;
        try {
            hatData = HatData.getHatData(new URL("https://raw.githubusercontent.com/manmaed/Pet-Rock/master/hats.json"));
            //hatData = HatData.getHatData(new URL("file:///F:/Modding/Fabric/PetRock/run/Test/hattesting.json"));
            String hat = hatData.isEventActive();
            usernames = hatData.getUsername();
            if(!userslow) {
                if(hat.equalsIgnoreCase("christmas")) {
                    christmas = true;
                }
                if(hat.equalsIgnoreCase("halloween")) {
                    halloween = true;
                }
                else if (hat.equalsIgnoreCase("birthday")) {
                    bday = true;
                    if (hatData.getUsername().equalsIgnoreCase("manmaed")) {
                        LogHelper.fatal("Please inform manmaed of this error: Happy Birthday!");
                    }
                    if (hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                        slowpoke = true;
                    } else {
                        LogHelper.info("Happy Birthday " + hatData.getUsername());
                    }
                }
            }
            if (userslow) {
                slowisplaying();
                slowpoke = true;
                if (hat.equalsIgnoreCase("birthday") & hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                    bday = true;
                    LogHelper.info("Happy Birthday Slowpoke101");
                }
                if (christmas) {
                    christmas = true;
                    LogHelper.info("Happy Christmas Slowpoke101");
                } else {
                    christmas = false;
                    halloween = false;
                    bday = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void slowisplaying() {
        slowpoke = true;
        userslow = true;
        if (bday & usernames.equalsIgnoreCase("Slowpoke101")) {
        //    bday = true;
            LogHelper.info("Happy Birthday Slowpoke101");
        }
        if (christmas) {
        //    christmas = true;
            LogHelper.info("Happy Christmas Slowpoke101");
        }
        LogHelper.info("Slowpoke101 Hat Enabled!");
    }*/
    public static void load() {
        HatData hatData = null;
        birthday = false;
        christmas = false;
        halloween = false;
        slowpoke = false;
        loneztar = false;
        try {
            hatData = HatData.getHatData(new URL("https://raw.githubusercontent.com/manmaed/Pet-Rock/master/hats.json"));
            //hatData = HatData.getHatData(new URL("file:///F:/Modding/1_14_4/PetRock/run/Test/hattesting.json"));
            String hat = hatData.isEventActive();
            usernames = hatData.getUsername();
            if(!userslow) {
                if(hat.equalsIgnoreCase("christmas")) {
                    christmas = true;
                }
                if(hat.equalsIgnoreCase("halloween")) {
                    halloween = true;
                }
                else if (hat.equalsIgnoreCase("birthday")) {
                    birthday = true;
                    if (hatData.getUsername().equalsIgnoreCase("manmaed")) {
                        LogHelper.fatal("Please inform manmaed of this error: Happy Birthday!");
                    }
                    if (hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                        slowpoke = true;
                    }
                    if (hatData.getUsername().equalsIgnoreCase("Loneztar")) {
                        birthday = false;
                        loneztar = true;
                        LogHelper.info("Happy Birthday Loneztar");
                    } else {
                        LogHelper.info("Happy Birthday " + hatData.getUsername());
                    }
                }
            }
            if (userslow) {
                /*slowisplaying();*/
                slowpoke = true;
                if (hat.equalsIgnoreCase("birthday") & hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                    birthday = true;
                    LogHelper.info("Happy Birthday Slowpoke101");
                }
                if (hat.equalsIgnoreCase("christmas")) {
                    christmas = true;
                    LogHelper.info("Happy Christmas Slowpoke101");
                /*} else {
                    christmas = false;
                    halloween = false;
                    birthday = false;*/
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void slowisplaying() {
        slowpoke = true;
        userslow = true;
        /*if (birthday & usernames.equalsIgnoreCase("Slowpoke101")) {
            //    bday = true;
            LogHelper.info("Happy Birthday Slowpoke101");
        }
        if (christmas) {
            //    christmas = true;
            LogHelper.info("Happy Christmas Slowpoke101");
        }*/
        LogHelper.info("Slowpoke101 Hat Enabled!");
    }

    public static void setHat(String hat) {
        birthday = false;
        christmas = false;
        halloween = false;
        loneztar = false;
        if (hat.equalsIgnoreCase("halloween")) {
            halloween = true;
        }
        if (hat.equalsIgnoreCase("christmas")) {
            christmas = true;
        }
        if (hat.equalsIgnoreCase("birthday")) {
            birthday = true;
        }
        if (hat.equalsIgnoreCase("loneztar")) {
            loneztar = true;
        }
        if (hat.equalsIgnoreCase("none")) {
            birthday = false;
            christmas = false;
            halloween = false;
            loneztar = false;
        }
    }
    public static void iamslowpoke101() {
        birthday = false;
        christmas = false;
        halloween = false;
        loneztar = false;
        slowpoke = false;
        userslow = false;
        slowisplaying();
    }
}
