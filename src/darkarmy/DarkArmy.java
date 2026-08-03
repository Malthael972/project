package darkarmy;

import mindustry.mod.Mod;
import mindustry.game.EventType;
import darkarmy.content.DarkUnits;

  public class DarkArmy extends Mod {
  @Override
    public void loadContent() {
    DarkUnits.load();
  }
}

