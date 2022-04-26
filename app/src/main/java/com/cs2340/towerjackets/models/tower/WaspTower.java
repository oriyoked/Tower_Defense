package com.cs2340.towerjackets.models.tower;
import com.cs2340.towerjackets.R;
import com.cs2340.towerjackets.models.Coin;
import com.cs2340.towerjackets.models.Player;

public class WaspTower extends Tower {

    public WaspTower() {
        super();
        setDrawableID(R.drawable.old_wasp);
        setCost(120);
    }

    // M5 & M6 JUnit Things
    private Coin c;
    private Player player;
    public WaspTower(Player player) {
        this.player = player;
        player.incrementTowerAvailable(2);
    }
    public void placeTower() {
        c = new Coin(10, 10, 10);
    }
    public void upgrade() {
        c = new Coin(10, 10, 20);
        player.setMoney(player.getMoney() - 110);
    }
    public Coin getCoin() {
        return c;
    }
    // End of M5 & M6 JUnit Things

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
