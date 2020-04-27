#include<iostream>
#include<string>

int add(int x, int y) {
    return x+y;
}
float add(double x, double y) {
  return x+y;
}
int main() {
  add(1,2);
  add(1.0, 2.1);
  return 0;
}
