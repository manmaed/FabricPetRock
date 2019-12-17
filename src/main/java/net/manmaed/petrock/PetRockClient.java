package net.manmaed.petrock;

import net.fabricmc.api.ClientModInitializer;
import net.manmaed.petrock.entity.PREntityClient;
import net.manmaed.petrock.libs.PRHats;
import net.minecraft.client.MinecraftClient;

/**
 * Created by manmaed on 01/09/2019.
 */
public class PetRockClient implements ClientModInitializer {

    public static String slow_uuid = "d2839efc727a426397ce3c73cdee5013";

    @Override
    public void onInitializeClient() {
        if(getplayerUUID().equals(slow_uuid)){
            PRHats.slowisplaying();
        }
        PREntityClient.loadRenders();
    }

    public String getplayerUUID() {
        return MinecraftClient.getInstance().getSession().getUuid().replace("-","");
    }
}
