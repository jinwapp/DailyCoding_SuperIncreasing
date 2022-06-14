// 문제: 수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.
// 출력: arr[i]는 arr[0]부터 arr[i-1]까지의 합보다 커야 합니다.
// 입출력 예시:
// boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
//        System.out.println(output); // --> true
//
//        output = superIncreasing(new int[]{1, 3, 5, 9});
//        System.out.println(output); // --> false


public class DailyCoding_SuperIncreasing {
    public static void main(String[] args) {

        int arr[] = {979,1737,-2146,-337,1316};

        int compare = 0;
        int sum_before_value = 0;
        // int len = arr.length를 구한다.
        int len = arr.length;

        // for (i는 0부터 ~ arr.length-2까지)
        for (int i = 0; i < arr.length-1; i++) {
            // compare = compare + arr[i]
            compare += arr[i];
            System.out.println(compare);
        }
        for (int i=1; i<len-1;i++){
            sum_before_value += arr[i-1];
            if(sum_before_value > arr[i]){
                System.out.println("false");
            }
        }

        // if (arr[length-1] > compare)
        if (arr[len-1] > compare) {
            // true 리턴
            System.out.println("true");
        // 그렇지 않으면
        } else {
            // false 리턴
            System.out.println("false");
        }
    }
}
