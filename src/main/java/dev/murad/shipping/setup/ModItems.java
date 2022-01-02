package dev.murad.shipping.setup;
import dev.murad.shipping.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> BARGE = Registration.ITEMS.register("barge",
            () -> new BargeItem(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> TUG = Registration.ITEMS.register("tug",
            () -> new TugItem(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> SPRING_CUTTER = Registration.ITEMS.register("cutter",
            () -> new SpringCutterItem(new Item.Properties().stacksTo(1).defaultDurability(64).tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> SPRING = Registration.ITEMS.register("spring",
            () -> new SpringItem(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> TUG_ROUTE = Registration.ITEMS.register("tug_route",
            () -> new TugRouteItem(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TRANSPORTATION)));

    public static void register () {

    }

}
