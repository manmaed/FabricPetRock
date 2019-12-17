package net.manmaed.petrock.libs;

import java.net.URL;

/**
 * Created by manmaed on 04/12/2018.
 */
public class PRHats {

    public static boolean bday = false;
    public static boolean christmas = false;
    public static boolean halloween = false;
    public static boolean slowpoke = false;
    public static boolean isSlowpokeplaying = false;
    public static String usernames = "";

    public static void load() {
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
            if(!isSlowpokeplaying) {
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
            if (isSlowpokeplaying) {
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
        isSlowpokeplaying = true;
        if (bday & usernames.equalsIgnoreCase("Slowpoke101")) {
        //    bday = true;
            LogHelper.info("Happy Birthday Slowpoke101");
        }
        if (christmas) {
        //    christmas = true;
            LogHelper.info("Happy Christmas Slowpoke101");
        }
        LogHelper.info("Slowpoke101 Hat Enabled!");
    }
    /*  public static void reload() {
          load();
          PetRock.proxy.renderlayers();
          EntityRendererPetRock.reload();
          LogHelper.info("Hats Reloaded!");
      }

      public static void setHat(String hat) {
          bday = false;
          christmas = false;
          halloween = false;
          slowpoke = false;
          if (!isSlowpokeplaying) {
              if (hat.equalsIgnoreCase("halloween")) {
                  halloween = true;
                  PetRock.proxy.renderlayers();
              }
              if (hat.equalsIgnoreCase("christmas")) {
                  christmas = true;
                  PetRock.proxy.renderlayers();
              }
              if (hat.equalsIgnoreCase( "birthday")) {
                  bday = true;
                  PetRock.proxy.renderlayers();
              }
              if (hat.equalsIgnoreCase( "none")) {
                  bday = false;
                  christmas = false;
                  halloween = false;
                  PetRock.proxy.renderlayers();
              }
          }
          if(isSlowpokeplaying) {
              slowpoke = true;
          }
      }
      public static void slowhatslowhat() {
          slowpoke = true;
          bday = false;
          christmas = false;
          halloween = false;
          PetRock.proxy.renderlayers();
          LogHelper.info("Slowpoke101 Hat Enabled!");
      }*/
    //Old Unused Code
}
