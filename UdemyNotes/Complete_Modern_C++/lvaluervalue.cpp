#include <iostream>

int foo(int &a) {
  std::cout<<"This is lvalue overload\n";
}

int foo(int &&a) {
  std::cout<<"This is rvalue overload\n";
}

int main() {
  int a =5;
  foo(a);
  foo(5);
  return 0;
}
