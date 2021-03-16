public class SurvivalEssentials implements ModInitializer {
    //crates
    public static final Block CRATE_BLOCK = new CrateBlock(FabricBlockSettings.of(Material.WOOD)
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(2.5f,3.0f));

    @Override
    public void onInitialize() {
        System.out.println("main mod initialization loaded fine™️");

        //Crates
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crate"), CRATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crate"), new BlockItem(CRATE_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "crate"), BlockEntityType.Builder.create(CrateBlockEntity::new,
                CRATE_BLOCK).build(null));
  }
}
