package c4.champions.common.affix;

import c4.champions.common.affix.affix.*;
import c4.champions.common.affix.core.AffixBase;

public class Affixes {

    public static AffixBase shielding;
    public static AffixBase molten;
    public static AffixBase reflecting;
    public static AffixBase vortex;
    public static AffixBase juggernaut;
    public static AffixBase dampening;
    public static AffixBase horde;
    public static AffixBase infested;
    public static AffixBase jailer;
    public static AffixBase arctic;

    public static void registerAffixes() {
        molten = new AffixMolten();
        shielding = new AffixShielding();
        reflecting = new AffixReflecting();
        vortex = new AffixVortex();
        juggernaut = new AffixJuggernaut();
        dampening = new AffixDampening();
        horde = new AffixHorde();
        infested = new AffixInfested();
        jailer = new AffixJailer();
        arctic = new AffixArctic();
    }
}