package token;

import art.FreeSoftArt;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class NftToken implements Token {

    private FreeSoftArt freeSoftArt;
    private UUID uniqueId;

    private NftToken(FreeSoftArt freeSoftArt) {
        this.freeSoftArt = freeSoftArt;
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

    private static class NftTokenRegistry {

        private static final Map<FreeSoftArt, NftToken> NFT_TOKEN_REGISTRY = new HashMap<>();

        private static NftToken putAndReturn(FreeSoftArt freeSoftArt, NftToken nftToken);
    }
}
