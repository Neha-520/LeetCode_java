public class _1108DefangingAnIPAddress {
    class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }
}
