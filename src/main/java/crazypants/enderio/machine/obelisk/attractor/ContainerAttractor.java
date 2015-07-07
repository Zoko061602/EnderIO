package crazypants.enderio.machine.obelisk.attractor;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import crazypants.enderio.machine.gui.AbstractMachineContainer;

public class ContainerAttractor extends AbstractMachineContainer<TileAttractor> {

  public ContainerAttractor(InventoryPlayer playerInv, TileAttractor te) {
    super(playerInv, te);
  }

  @Override
  protected void addMachineSlots(InventoryPlayer playerInv) {
    int x;
    int y = 10;    
    for (int row = 0; row < 3; row++) {
      x = 62;
      for (int col = 0; col < 4; col++) {
        final int index = (row * 4) + col;
        addSlotToContainer(new Slot(getInv(), index, x, y) {
          @Override
          public boolean isItemValid(ItemStack itemStack) {
            return getInv().isItemValidForSlot(index, itemStack);
          }
        });
        x += 18;
      }
      y+= 18;
    }
  }

}
