/**
 *Summary: Exercise 05_06
 *Author: Tomasz Baj s20499
 */

package E05_06;

public class TableOfElements {

    private ChemicalElement[] table = new ChemicalElement[109];
    private Group[] groups = new Group[9];

    public TableOfElements() {

        int i = 0;
        Group alkaliMetal           = new Group("Alkali metal");
        Group alkalineEarthMetal    = new Group("Alkaline earth metal");
        Group transitionMetal       = new Group("Transition metal");
        Group postTransitionMetal   = new Group("Post transition metal");
        Group metalloid             = new Group("Metalloid");
        Group nonmetal              = new Group("Nonmetal");
        Group nobleGas              = new Group("Noble gas");
        Group lanthanide            = new Group("Lanthanide");
        Group actinide              = new Group("Actinide");


        table[i++] = new ChemicalElement(1, "Hydrogen", nonmetal);
        table[i++] = new ChemicalElement(2, "Helium", nobleGas);
        table[i++] = new ChemicalElement(3, "Lithium", alkaliMetal);
        table[i++] = new ChemicalElement(4, "Beryllium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(5, "Boron", metalloid);
        table[i++] = new ChemicalElement(6, "Carbon", nonmetal);
        table[i++] = new ChemicalElement(7, "Nitrogen", nonmetal);
        table[i++] = new ChemicalElement(8, "Oxygen", nonmetal);
        table[i++] = new ChemicalElement(9, "Fluorine", nonmetal);
        table[i++] = new ChemicalElement(10, "Neon", nobleGas);
        table[i++] = new ChemicalElement(11, "Sodium", alkaliMetal);
        table[i++] = new ChemicalElement(12, "Magnesium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(13, "Aluminum", postTransitionMetal);
        table[i++] = new ChemicalElement(14, "Silicon", metalloid);
        table[i++] = new ChemicalElement(15, "Phosphorus", nonmetal);
        table[i++] = new ChemicalElement(16, "Sulfur", nonmetal);
        table[i++] = new ChemicalElement(17, "Chlorine", nonmetal);
        table[i++] = new ChemicalElement(18, "Argon", nobleGas);
        table[i++] = new ChemicalElement(19, "Potassium", alkaliMetal);
        table[i++] = new ChemicalElement(20, "Calcium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(21, "Scandium", transitionMetal);
        table[i++] = new ChemicalElement(22, "Titanium", transitionMetal);
        table[i++] = new ChemicalElement(23, "Vanadium", transitionMetal);
        table[i++] = new ChemicalElement(24, "Chromium", transitionMetal);
        table[i++] = new ChemicalElement(25, "Manganese", transitionMetal);
        table[i++] = new ChemicalElement(26, "Iron", transitionMetal);
        table[i++] = new ChemicalElement(27, "Cobalt", transitionMetal);
        table[i++] = new ChemicalElement(28, "Nickel", transitionMetal);
        table[i++] = new ChemicalElement(29, "Copper", transitionMetal);
        table[i++] = new ChemicalElement(30, "Zinc", postTransitionMetal);
        table[i++] = new ChemicalElement(31, "Gallium", postTransitionMetal);
        table[i++] = new ChemicalElement(32, "Germanium", metalloid);
        table[i++] = new ChemicalElement(33, "Arsenic", metalloid);
        table[i++] = new ChemicalElement(34, "Selenium", nonmetal);
        table[i++] = new ChemicalElement(35, "Bromine", nonmetal);
        table[i++] = new ChemicalElement(36, "Krypton", nobleGas);
        table[i++] = new ChemicalElement(37, "Rubidium", alkaliMetal);
        table[i++] = new ChemicalElement(38, "Strontium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(39, "Yttrium", transitionMetal);
        table[i++] = new ChemicalElement(40, "Zirconium", transitionMetal);
        table[i++] = new ChemicalElement(41, "Niobium", transitionMetal);
        table[i++] = new ChemicalElement(42, "Molybdenum", transitionMetal);
        table[i++] = new ChemicalElement(43, "Technetium", transitionMetal);
        table[i++] = new ChemicalElement(44, "Ruthenium", transitionMetal);
        table[i++] = new ChemicalElement(45, "Rhodium", transitionMetal);
        table[i++] = new ChemicalElement(46, "Palladium", transitionMetal);
        table[i++] = new ChemicalElement(47, "Silver", transitionMetal);
        table[i++] = new ChemicalElement(48, "Cadmium", postTransitionMetal);
        table[i++] = new ChemicalElement(49, "Indium", postTransitionMetal);
        table[i++] = new ChemicalElement(50, "Tin", postTransitionMetal);
        table[i++] = new ChemicalElement(51, "Antimony", metalloid);
        table[i++] = new ChemicalElement(52, "Tellurium", metalloid);
        table[i++] = new ChemicalElement(53, "Iodine", nonmetal);
        table[i++] = new ChemicalElement(54, "Xenon", nobleGas);
        table[i++] = new ChemicalElement(55, "Cesium", alkaliMetal);
        table[i++] = new ChemicalElement(56, "Barium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(57, "Lanthanum", lanthanide);
        table[i++] = new ChemicalElement(58, "Cerium", lanthanide);
        table[i++] = new ChemicalElement(59, "Praseodymium", lanthanide);
        table[i++] = new ChemicalElement(60, "Neodymium", lanthanide);
        table[i++] = new ChemicalElement(61, "Promethium", lanthanide);
        table[i++] = new ChemicalElement(62, "Samarium", lanthanide);
        table[i++] = new ChemicalElement(63, "Europium", lanthanide);
        table[i++] = new ChemicalElement(64, "Gadolinium", lanthanide);
        table[i++] = new ChemicalElement(65, "Terbium", lanthanide);
        table[i++] = new ChemicalElement(66, "Dysprosium", lanthanide);
        table[i++] = new ChemicalElement(67, "Holmium", lanthanide);
        table[i++] = new ChemicalElement(68, "Erbium", lanthanide);
        table[i++] = new ChemicalElement(69, "Thulium", lanthanide);
        table[i++] = new ChemicalElement(70, "Ytterbium", lanthanide);
        table[i++] = new ChemicalElement(71, "Lutetium", lanthanide);
        table[i++] = new ChemicalElement(72, "Hafnium", transitionMetal);
        table[i++] = new ChemicalElement(73, "Tantalum", transitionMetal);
        table[i++] = new ChemicalElement(74, "Tungsten", transitionMetal);
        table[i++] = new ChemicalElement(75, "Rhenium", transitionMetal);
        table[i++] = new ChemicalElement(76, "Osmium", transitionMetal);
        table[i++] = new ChemicalElement(77, "Iridium", transitionMetal);
        table[i++] = new ChemicalElement(78, "Platinum", transitionMetal);
        table[i++] = new ChemicalElement(79, "Gold", postTransitionMetal);
        table[i++] = new ChemicalElement(80, "Mercury", postTransitionMetal);
        table[i++] = new ChemicalElement(81, "Thallium", postTransitionMetal);
        table[i++] = new ChemicalElement(82, "Lead", postTransitionMetal);
        table[i++] = new ChemicalElement(83, "Bismuth", postTransitionMetal);
        table[i++] = new ChemicalElement(84, "Polonium", postTransitionMetal);
        table[i++] = new ChemicalElement(85, "Astatine", metalloid);
        table[i++] = new ChemicalElement(86, "Radon", nobleGas);
        table[i++] = new ChemicalElement(87, "Francium", alkaliMetal);
        table[i++] = new ChemicalElement(88, "Radium", alkalineEarthMetal);
        table[i++] = new ChemicalElement(89, "Actinium", actinide);
        table[i++] = new ChemicalElement(90, "Thorium", actinide);
        table[i++] = new ChemicalElement(91, "Protactinium", actinide);
        table[i++] = new ChemicalElement(92, "Uranium", actinide);
        table[i++] = new ChemicalElement(93, "Neptunium", actinide);
        table[i++] = new ChemicalElement(94, "Plutonium", actinide);
        table[i++] = new ChemicalElement(95, "Americium", actinide);
        table[i++] = new ChemicalElement(96, "Curium", actinide);
        table[i++] = new ChemicalElement(97, "Berkelium", actinide);
        table[i++] = new ChemicalElement(98, "Californium", actinide);
        table[i++] = new ChemicalElement(99, "Einsteinium", actinide);
        table[i++] = new ChemicalElement(100, "Fermium", actinide);
        table[i++] = new ChemicalElement(101, "Mendelevium", actinide);
        table[i++] = new ChemicalElement(102, "Nobelium", actinide);
        table[i++] = new ChemicalElement(103, "Lawrencium", actinide);
        table[i++] = new ChemicalElement(104, "Rutherfordium", transitionMetal);
        table[i++] = new ChemicalElement(105, "Dubnium", transitionMetal);
        table[i++] = new ChemicalElement(106, "Seaborgium", transitionMetal);
        table[i++] = new ChemicalElement(107, "Bohrium", transitionMetal);
        table[i++] = new ChemicalElement(108, "Hassium", transitionMetal);
        table[i++] = new ChemicalElement(109, "Meitnerium", transitionMetal);

        alkaliMetal.setList(table);
        alkalineEarthMetal.setList(table);
        transitionMetal.setList(table);
        postTransitionMetal.setList(table);
        metalloid.setList(table);
        nonmetal.setList(table);
        nobleGas.setList(table);
        lanthanide.setList(table);
        actinide.setList(table);


        i = 0;
        groups[i++] = alkaliMetal;
        groups[i++] = alkalineEarthMetal;
        groups[i++] = transitionMetal;
        groups[i++] = postTransitionMetal;
        groups[i++] = metalloid;
        groups[i++] = nonmetal;
        groups[i++] = nobleGas;
        groups[i++] = lanthanide;
        groups[i++] = actinide;
    }

    public ChemicalElement[] getTable() {
        return table;
    }

    public void setTable(ChemicalElement[] table) {
        this.table = table;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void setElement(ChemicalElement x){
        this.table[x.getNumber()]=x;
    }

    public ChemicalElement getElement(int x) {
        return this.table[x];
    }

}

