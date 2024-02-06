import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Member(sc.nextInt(), sc.next(), i));
        }

        list.stream()
                .sorted(Comparator.comparing(Member::getAge)
                        .thenComparing(Member::getIndex))
                .forEach(System.out::println);
    }
    static class Member {
        Integer age;
        String name;
        Integer index;

        Member(Integer age, String name, Integer index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public Integer getIndex() {
            return index;
        }

        public String toString() {
            return age + " " + name;
        }
    }
}