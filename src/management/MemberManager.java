package management;

import library.Member;
import library.Transaction;

import java.util.HashMap;
import java.util.Map;

public class MemberManager {
    private Map<String, Member> Members;

    public MemberManager() {
        this.Members = new HashMap<>();
    }

    public void addMember(Member member) {
        Members.put(member.getMemberId(), member);
    }

    public Member getMember(String memberId) {
        return Members.get(memberId);
    }

    public void recordTransaction(String memberId, Transaction transaction) {
        Members.get(memberId).addTransaction(transaction);
    }

    public Transaction getLastTransaction(String memberId) {
        return Members.get(memberId).getLastTransaction();
    }
}
