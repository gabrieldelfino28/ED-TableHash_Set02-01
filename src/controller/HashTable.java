package controller;

import fateczl.Lista.model.Lista;


public class HashTable {
    Lista<Integer>[] table = new Lista[100];

    public HashTable() {
        for (int i = 0; i < 100; i++) {
            table[i] = new Lista<>();
        }
    }

    public void add(int num) throws Exception {
        int pos = hash(num);
        if (table[pos].isEmpty()) {
            table[pos].addFirst(num);
        } else {
            table[pos].addLast(num);
        }
    }

    public void print() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.print("Hash: " + i + " -> ");
            for (int j = 0; j < table[i].size(); j++) {
                if (!table[i].isEmpty()) {
                    System.out.print(table[i].get(j) + ", ");
                }
            }
            System.out.print("\n");
        }
    }

    private int hash(int num) {
        double sqrt = ((Math.sqrt(7) - 1) / 2);
        int hashCode = (int) (100 * ((sqrt * num) % 1));
        return hashCode;
    }
}
