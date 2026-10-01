class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int carry = 0;

while (l1 >= 0||l2 >= 0) {

int n1 = 0;
int n2 =0;

    if(l1 >= 0) {
        n1 =a.charAt(l1) - '0';
 }

if (l2 >= 0) {
                n2 = b.charAt(l2) - '0';}

            int sum = n1 + n2 + carry;

            if (sum== 0) {
                ans= '0' + ans;
                carry = 0;
            }
            else if (sum == 1) {
                ans = '1' + ans;
                carry = 0;
            }
            else if (sum == 2) {
                ans = '0' + ans;
                carry = 1;
            }
            else {
                ans = '1' + ans;
                carry = 1;
            }

            l1--;
            l2--;
        }

        if (carry == 1) {
            ans = '1' + ans;
        }

        return ans;
    }
}