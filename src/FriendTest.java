class Friend {
    public void friendInfo(){
        System.out.println("나는 당신의 친구입니다.");
    }
}
class BoyFriend extends Friend {
    public void friendInfo(){
        System.out.println("나는 당신의 남자친구입니다.");
    }
}
class Girlfriend extends Friend {
    public void friendInfo(){
        System.out.println("나는 당신의 여자친구입니다.");
    }
}

public class FriendTest {
    public static void main(String[] args){
        Friend friend = new Friend(); // 객체타입과 참조변수 타입 일치
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new Girlfriend();//객체 타입과 참조변수 타입 불일치
        // GirlFriend friend1 = new Friend(); // 하위클래스 타입으로 상위클래스 객체 참조 불가능

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
