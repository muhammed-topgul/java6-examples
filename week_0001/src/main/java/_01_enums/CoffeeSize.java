package _01_enums;

/*
 * created by Muhammed Topgul
 * on 12/10/2020
 * at 09:41
 */

public enum CoffeeSize {
    SHORT(3), TALL(5), GRANDE(7), VENTI(9);

    private int size;

    CoffeeSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
