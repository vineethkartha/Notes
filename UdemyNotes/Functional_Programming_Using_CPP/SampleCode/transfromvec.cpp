#include <iostream>
#include <vector>
#include <algorithm>

//template<typename T>
int square(int t) {
  return(t*t); 
}

template<typename F, typename T>
std::vector<T> transform_vec(F f, const std::vector<T>& vec) {
  std::vector<T> result;
  std::transform(std::begin(vec),std::end(vec),std::back_inserter(result),f);
  return result;
}
int main() {
  std::vector<int> vec{1,2,3,4};
  std::vector<int> res=transform_vec(square, vec);
  for(const auto& n: res){
    std::cout<<n<<"\n";
  }
}
