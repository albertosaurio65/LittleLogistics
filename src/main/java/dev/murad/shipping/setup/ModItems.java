package dev.murad.shipping.setup;
import dev.murad.shipping.item.ModBargeItem;
import dev.murad.shipping.item.TugItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SHIP_LINK = Registration.ITEMS.register("ship_link",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> BARGE = Registration.ITEMS.register("barge",
            () -> new ModBargeItem(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> TUG = Registration.ITEMS.register("tug",
            () -> new TugItem(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static void register () {

    }

}
