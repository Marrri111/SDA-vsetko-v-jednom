package org.example.javaAdvancedCoding.sealed;


public sealed class Planet permits Merkur, Venus, Mars, Earth {

    public static void main(String[] args) {

    }
}

final class Merkur extends Planet {
}

final class Venus extends Planet {
}

final class Mars extends Planet {
}

final class Earth extends Planet {

}
