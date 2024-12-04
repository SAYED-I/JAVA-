import java.util.Random;

public class ExpeditionMain {
    public static void main(String[] args) {
        String[] allNames = {"Liam", "Noah", "Lucas", "James", "Jimmy", "Mike"};
        String[] allStudentIDs = {"PL100", "PL200", "PL300", "PL400", "PL500", "PL600"};

        Random random = new Random();
        int numMembers = random.nextInt(3) + 4; // Randomly between 4 and 6 members

        ExpeditionMember[] members = new ExpeditionMember[numMembers];

        int index = 0;
        while(index < numMembers) {
            members[index] = new ExpeditionMember(allNames[random.nextInt(allNames.length)], allStudentIDs[random.nextInt(allStudentIDs.length)]);
            index++;
        }

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[numMembers-3], members[numMembers-2], members[numMembers-1]);

        System.out.println("Pyramid Expedition: \n" + pyramidExpedition.getExpeditionLeader().getStudentName());
        System.out.println(pyramidExpedition.getArchivist().getStudentName());
        System.out.println(pyramidExpedition.getFieldResearcher().getStudentName());

        System.out.println("Nile Expedition: \n" + nileExpedition.getExpeditionLeader().getStudentName());
        System.out.println(nileExpedition.getArchivist().getStudentName());
        System.out.println(nileExpedition.getFieldResearcher().getStudentName());

        System.out.println(ExpeditionMember.memberCounter);
        System.out.println(members.length);
        if(ExpeditionMember.memberCounter == members.length) {
            System.out.println("Success");
        }
    }
}

/*import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionMain {
    public static void main(String[] args) {
        // Initial names and student IDs
        String[] allNames = {"Liam", "Noah", "Lucas", "James", "Jimmy", "Mike"};
        String[] allStudentIDs = {"PL100", "PL200", "PL300", "PL400", "PL500", "PL600"};

        // Convert the arrays to lists to shuffle them
        List<String> nameList = new ArrayList<>();
        List<String> idList = new ArrayList<>();
        Collections.addAll(nameList, allNames);
        Collections.addAll(idList, allStudentIDs);

        // Shuffle the lists to randomize the order
        Collections.shuffle(nameList);
        Collections.shuffle(idList);

        Random random = new Random();
        int numMembers = random.nextInt(3) + 4; // Randomly between 4 and 6 members

        // Ensure we only pick unique names by using shuffled lists
        ExpeditionMember[] members = new ExpeditionMember[numMembers];

        for (int i = 0; i < numMembers; i++) {
            members[i] = new ExpeditionMember(nameList.get(i), idList.get(i));
        }

        // Create expeditions
        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[numMembers-3], members[numMembers-2], members[numMembers-1]);

        // Output the expedition details
        System.out.println("Pyramid Expedition: ");
        System.out.println(pyramidExpedition.getExpeditionLeader().getStudentName());
        System.out.println(pyramidExpedition.getArchivist().getStudentName());
        System.out.println(pyramidExpedition.getFieldResearcher().getStudentName());

        System.out.println("Nile Expedition: ");
        System.out.println(nileExpedition.getExpeditionLeader().getStudentName());
        System.out.println(nileExpedition.getArchivist().getStudentName());
        System.out.println(nileExpedition.getFieldResearcher().getStudentName());

        // Print the member count and verify success
        System.out.println("Member counter: " + ExpeditionMember.memberCounter);
        System.out.println("Total members: " + members.length);
        if (ExpeditionMember.memberCounter == members.length) {
            System.out.println("Success");
        }
    }
}
*/