package alkr;

import art.FreeSoftArt;
import except.KeyAlreadyExists;
import token.NftToken;

public class Main {

    public static void main(String[] args) {
        FreeSoftArt nyanCat = new FreeSoftArt("Nyan Cat");
        FreeSoftArt firstTwit = new FreeSoftArt("First twit");
        try {
            System.out.println(NftToken.of(nyanCat));
        } catch (KeyAlreadyExists keyAlreadyExists) {
            System.out.println(keyAlreadyExists.getMessage());
        }
        try {
            System.out.println(NftToken.of(nyanCat));
        } catch (KeyAlreadyExists keyAlreadyExists) {
            System.out.println(keyAlreadyExists.getMessage());
        }
        try {
            System.out.println(NftToken.of(firstTwit));
        } catch (KeyAlreadyExists keyAlreadyExists) {
            System.out.println(keyAlreadyExists.getMessage());
        }
        FreeSoftArt anotherNyanCat = new FreeSoftArt("Nyan Cat");
        System.out.println(nyanCat.equals(anotherNyanCat));
    }
}
