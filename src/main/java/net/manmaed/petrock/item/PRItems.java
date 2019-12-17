package net.manmaed.petrock.item;

import net.manmaed.petrock.PetRock;
import net.manmaed.petrock.entity.PREntitys;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 30/08/2019.
 */
public class PRItems {

    /* Example On Registering Items
    public static Item itemname;

    * in RegisterItems()
    itemname = new Item(new Item.Settings().group(PetRock.ITEM_GROUP));
    makeItems("nameofitem", itemname);
     */

    public static Item prorderform;
    public static Item petrockbox;
    public static Item stoneium;
    public static Item kibble;

    public static void RegisterItems() {
        prorderform = new OrderForm(new Item.Settings().group(PetRock.ITEM_GROUP).maxCount(1));
        petrockbox = new SpawnEggItem(PREntitys.petrock, 0, 0, new Item.Settings().group(PetRock.ITEM_GROUP).maxCount(1));
        stoneium = new Stoneium(new Item.Settings().group(PetRock.ITEM_GROUP));
        kibble = new Kibble(new Item.Settings().group(PetRock.ITEM_GROUP));

        //

        makeItems("prorderform", prorderform);
        makeItems("petrockbox", petrockbox);
        makeItems("stoneium", stoneium);
        makeItems("kibble", kibble);
    }

    public static void makeItems(String itemName, Item item){
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, itemName), item);
    }

}
