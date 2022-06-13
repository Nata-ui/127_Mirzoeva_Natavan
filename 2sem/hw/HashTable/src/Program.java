public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(29);
        hashTable.print();
        System.out.println();

        hashTable.insert(19);
        hashTable.print();
        System.out.println();

        hashTable.insert(30);
        hashTable.print();
        System.out.println();

        hashTable.insert(27);
        hashTable.print();
        System.out.println();

        hashTable.insert(91);
        hashTable.print();
        System.out.println();

        hashTable.insert(65);
        hashTable.print();
        System.out.println();

        hashTable.insert(2);
        hashTable.print();
        System.out.println();

        hashTable.insert(27);
        hashTable.print();
        System.out.println();

        hashTable.insert(28);
        hashTable.print();
        System.out.println();

        hashTable.insert(12);
        hashTable.print();
        System.out.println();

        hashTable.insert(14);
        hashTable.print();
        System.out.println();

        hashTable.insert(63);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(41);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(13);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(9);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(83);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(59);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(4);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(79);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(20);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(56);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(59);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(22);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(21);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(85);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(46);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(14);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(21);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(79);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(56);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(85);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(14);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(25);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(93);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(11);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(63);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(7);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(46);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(76);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(11);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(38);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(59);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(8);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(25);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(63);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(18);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(60);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(85);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(93);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(59);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(18);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(43);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(12);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(18);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(12);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(76);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(43);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(7);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(60);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(88);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(53);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(25);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(91);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(54);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(73);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(81);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(6);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(54);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(11);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(40);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(83);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(6);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(66);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(11);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(80);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(24);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(23);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(51);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(9);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(51);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(93);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(48);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(9);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(93);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(80);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(23);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(83);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(54);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(79);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(22);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(75);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(64);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(9);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(38);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(53);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(2);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(38);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(22);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(53);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(38);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(32);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(11);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(54);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(32);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(48);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(2);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(88);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(75);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(9);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(48);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(79);
        listHashTable2.print();
        System.out.println();
    }
}
