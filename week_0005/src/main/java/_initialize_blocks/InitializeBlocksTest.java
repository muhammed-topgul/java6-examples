package _initialize_blocks;

/*
 * created by Muhammed Topgul
 * on 19/10/2020
 * at 08:38
 */

class Initialize {

    public Initialize() {
        System.out.println("Constructor");
    }

    // static initialize blocks
    static {
        System.out.println("Static initialize blocks 1");
    }

    static {
        System.out.println("Static initialize blocks 2");
    }

    // instance initialize blocks
    {
        System.out.println("Instance initialize blocks 1");
    }

    {
        System.out.println("Instance initialize blocks 2");
    }
}

public class InitializeBlocksTest {
    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        Initialize initialize2 = new Initialize();
    }
}

// static ve instance initialize blocks constructortan once calisir
// static initialize blocks class yuklendiginde bir kez olusur
// instance blocks obje her olusturuldugunda calisir
