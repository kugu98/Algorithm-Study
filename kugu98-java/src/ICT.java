import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ICT {
    public static int minMeetingRooms(int[][] meetings) {
        // 정렬된 회의 시간 배열을 사용하여 최소 회의실 수 계산
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        // 최소 힙을 사용하여 회의 종료 시간을 기록
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(meetings[0][1]);

        for (int i = 1; i < meetings.length; i++) {
            // 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 작거나 같으면 새로운 회의실 필요
            if (meetings[i][0] < minHeap.peek()) {
                minHeap.offer(meetings[i][1]);  // 새로운 회의실 추가
            } else {
                minHeap.poll();  // 기존 회의실 이용
                minHeap.offer(meetings[i][1]);  // 종료 시간 갱신
            }
        }

        // 최소 회의실 수 반환
        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] meetingTimings = {{1, 4}, {1, 5}, {5, 6}, {6, 10}, {7, 9}};
        int minRooms = minMeetingRooms(meetingTimings);
        System.out.println("Minimum number of meeting rooms required: " + minRooms);
    }
}
