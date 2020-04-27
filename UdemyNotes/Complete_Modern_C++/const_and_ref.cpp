#include <iostream>

int main() {
  int a =5;
  //int &ref = 1; // Not allowed
  const int &ref = 1; // allowed
  int x = 5;
  const int MAX = 12;
  int &ref_x1 = x;
  const int &ref_x2 = x;
  ref_x1 = 1;
  ref_x2 = 3;
  return 0;
}
