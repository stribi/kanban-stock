package com.kanbanstock.backend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanbanstock.backend.model.Item;
import com.kanbanstock.backend.model.Kit;
import com.kanbanstock.backend.model.KitItem;
import com.kanbanstock.backend.repository.ItemRepository;
import com.kanbanstock.backend.repository.KitItemRepository;
import com.kanbanstock.backend.repository.KitRepository;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final KitRepository kitRepository;
    private final KitItemRepository kitItemRepository;

    public TestDataLoader(ItemRepository itemRepository, KitRepository kitRepository, KitItemRepository kitItemRepository) {
        this.itemRepository = itemRepository;
        this.kitRepository = kitRepository;
        this.kitItemRepository = kitItemRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("runner started...");
  Item item;
Kit kit;
KitItem kitItem;

// --- Create Items ---
item = new Item();
item.setCode("ITM001");
item.setName("Bracket");
itemRepository.save(item);
Item ITM001 = item;

item = new Item();
item.setCode("ITM002");
item.setName("Screw M4");
itemRepository.save(item);
Item ITM002 = item;

item = new Item();
item.setCode("ITM003");
item.setName("Sensor Cable");
itemRepository.save(item);
Item ITM003 = item;

item = new Item();
item.setCode("ITM004");
item.setName("Housing Plate");
itemRepository.save(item);
Item ITM004 = item;

item = new Item();
item.setCode("ITM005");
item.setName("Power Connector");
itemRepository.save(item);
Item ITM005 = item;

item = new Item();
item.setCode("ITM006");
item.setName("Laser Mount");
itemRepository.save(item);
Item ITM006 = item;

item = new Item();
item.setCode("ITM007");
item.setName("Joint Shaft");
itemRepository.save(item);
Item ITM007 = item;

item = new Item();
item.setCode("ITM008");
item.setName("Cooling Fan");
itemRepository.save(item);
Item ITM008 = item;

item = new Item();
item.setCode("ITM009");
item.setName("Rubber Seal");
itemRepository.save(item);
Item ITM009 = item;

item = new Item();
item.setCode("ITM010");
item.setName("Plastic Clip");
itemRepository.save(item);
Item ITM010 = item;

// --- Create Kits and KitItems ---
kit = new Kit();
kit.setCode("STRUCTURE_KIT");
kit.setName("Structure Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM001);
kitItem.setQuantity(4);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM002);
kitItem.setQuantity(10);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM004);
kitItem.setQuantity(1);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM009);
kitItem.setQuantity(6);
kitItemRepository.save(kitItem);

kit = new Kit();
kit.setCode("BASE_KIT");
kit.setName("Base Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM001);
kitItem.setQuantity(4);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM003);
kitItem.setQuantity(2);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM010);
kitItem.setQuantity(8);
kitItemRepository.save(kitItem);

kit = new Kit();
kit.setCode("LASER_TRIGGER_KIT");
kit.setName("Laser Trigger Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM002);
kitItem.setQuantity(10);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM006);
kitItem.setQuantity(2);
kitItemRepository.save(kitItem);

kit = new Kit();
kit.setCode("PSU_BOX_KIT");
kit.setName("PSU Box Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM002);
kitItem.setQuantity(10);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM005);
kitItem.setQuantity(3);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM009);
kitItem.setQuantity(6);
kitItemRepository.save(kitItem);

kit = new Kit();
kit.setCode("EBOX_KIT");
kit.setName("Ebox Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM003);
kitItem.setQuantity(2);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM005);
kitItem.setQuantity(3);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM008);
kitItem.setQuantity(1);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM010);
kitItem.setQuantity(8);
kitItemRepository.save(kitItem);

kit = new Kit();
kit.setCode("MOTORIZED_JOINT_KIT");
kit.setName("Motorized Joint Kit");
kitRepository.save(kit);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM005);
kitItem.setQuantity(3);
kitItemRepository.save(kitItem);
kitItem = new KitItem();
kitItem.setKit(kit);
kitItem.setItem(ITM007);
kitItem.setQuantity(2);
kitItemRepository.save(kitItem);

    }
}
