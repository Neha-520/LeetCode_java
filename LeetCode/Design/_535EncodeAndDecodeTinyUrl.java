public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

public class _535EncodeAndDecodeTinyUrl {
    public class Codec {
        Map<String, String> map = new HashMap();
        int val = 0;

        public String encode(String longUrl) {
            String enc = "http://tinyurl.com/" + val++;
            map.put(enc, longUrl);
            return enc;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            if (map.containsKey(shortUrl)) {
                return map.get(shortUrl);
            }
            return "";
        }
    }
}
