package com.company;

/**
 * modificatori de acces:
 *  - public
 *  - protected (clasele din acelasi pachet au acces la datele membre protected intre ele, clasele din alt pachet au acces
 *      doar prin mostenire)
 *  - default (numai clasele din acelasi pachet au acces la datele membre default intre ele, nu mai exista posibilitatea
 *      de mostenire pentru clasele din alt pachet)
 *  - private
 */

public class Main {
    public static void main(String[] args) {
	    Demo d1 = new Demo(Sorter.create(Sorter.SorterType.BUBBLE));
        Demo d2 = new Demo(Sorter.create(Sorter.SorterType.INTER));
    }
}
