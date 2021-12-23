class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] temp = new int[m + n];
      int i1 = 0;
      int i2 = 0;
      if (n == 0) {
          return;
      }
      
      for (int i = 0; i < (m + n); i++) {
          if (i1 > m - 1) {
              temp[i] = nums2[i2];
              i2++;
              continue;
          }
          
          if (i2 == n) {
              temp[i] = nums1[i1];
              i1++;
              continue;
          }

          if (nums1[i1] < nums2[i2]) {
              temp[i] = nums1[i1];
              i1++;
          } else {
              temp[i] = nums2[i2];
              i2++;
          }
      }
      
      for (int j = 0; j < (m + n); j++) {
          nums1[j] = temp[j];
      }
      
      return ;
      
  }
}