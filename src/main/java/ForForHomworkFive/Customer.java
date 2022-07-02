package ForForHomworkFive;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
