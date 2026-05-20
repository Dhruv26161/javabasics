package practicepolymorphism;

import practiceinheritance.GrandFather;

public class TestFamilyTree {
    static void main(String[] args) {
        FamilyTree ft=new FamilyTree();
        Grandfather gf=new Grandfather();
        Parent p=new Parent();
        GrandSon gs=new GrandSon();
        ft.achievement();
        gf.achievement();
        p.achievement();
        gs.achievement();

    }
}
