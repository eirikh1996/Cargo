package io.github.cccm5;

import org.bukkit.entity.Player;

import net.countercraft.movecraft.craft.Craft;
import net.countercraft.movecraft.craft.CraftManager;
import net.countercraft.movecraft.utils.MovecraftLocation;

import net.dandielo.citizens.traders_v3.traders.stock.Stock;
import net.dandielo.citizens.traders_v3.traders.stock.StockItem;
public class UnloadTask extends CargoTask
{
    public UnloadTask(Craft craft, Stock stock, StockItem item){
        super(craft,stock,item);
    }

    public void execute(){
        //************************
        //*     To Implement     *
        //************************
        //check if there's any chests with cargo, cancel if true
        //get the first chest with cargo
        //get the price of all the cargo
        //remove the items, pay the user while taking a tax
    }
}
