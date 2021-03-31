package token;

import art.FreeSoftArt;
import except.KeyAlreadyExists;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class NftToken implements Token {

    private FreeSoftArt freeSoftArt;
    private UUID uniqueId;

    public NftToken(FreeSoftArt freeSoftArt) {
        this.freeSoftArt = freeSoftArt;
        this.uniqueId = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NftToken nftToken = (NftToken) o;
        return freeSoftArt.equals(nftToken.freeSoftArt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeSoftArt);
    }

    @Override
    public String toString() {
        return "NftToken{" +
                "freeSoftArt=" + freeSoftArt +
                ", uniqueId=" + uniqueId +
                '}';
    }

    public static NftToken of(FreeSoftArt freeSoftArt) throws KeyAlreadyExists {
        return NftTokenRegistry.putAndReturn(freeSoftArt, new NftToken(freeSoftArt));
    }

    private static class NftTokenRegistry {

        private static final Map<FreeSoftArt, NftToken> NFT_TOKEN_REGISTRY = new HashMap<>();

        private static NftToken putAndReturn(FreeSoftArt freeSoftArt, NftToken nftToken) throws KeyAlreadyExists {
            if (NFT_TOKEN_REGISTRY.containsKey(freeSoftArt)) {
                throw new KeyAlreadyExists("This key is already in registry");
            } else {
                NFT_TOKEN_REGISTRY.put(freeSoftArt, nftToken);
            }
            return NFT_TOKEN_REGISTRY.get(freeSoftArt);
        }
    }
}
