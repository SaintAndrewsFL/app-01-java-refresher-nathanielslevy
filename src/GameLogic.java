import java.util.Scanner;
import java.util.ArrayList;

public class GameLogic {
    private int numPoints = 0;
    private String userInput;
    private boolean isRunning;


    public GameLogic() {
        System.out.println("Welcome to Flashcard Game!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Select Difficulty: Normal or Difficult? ");
        this.userInput = scanner.nextLine();
        System.out.println("You selected: " + userInput);

    }

    public String getUserInput() {
        return userInput;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void runNormal() {
        while (numPoints != 27) {
            ArrayList<String> incorrectDefinitionList = new ArrayList<>();
            int defIndex = (int) (Math.random() * 27);

            // Print out randomly selected definition
            System.out.println(Vocab.getDefinitionList().get(defIndex) + ":");

            // Four random words
            System.out.println("A: " + Vocab.getWordList().get((defIndex + 5) % 27));
            System.out.println("B: " + Vocab.getWordList().get((defIndex + 20) % 27));
            System.out.println("C: " + Vocab.getWordList().get((defIndex) % 27));
            System.out.println("D: " + Vocab.getWordList().get((defIndex - 10) % 27));

            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equals("C")) {
                System.out.println("Correct!");
                numPoints++;
            } else {
                System.out.println("Incorrect!");
            }
        }
    }

    public void runDifficult() {

    }

    public void generateVocabList() {
        Vocab vocab1 = new Vocab("acess token", "A string of characters that serves as" +
                "a secure authentication credential");
        Vocab vocab2 = new Vocab("blame", "The \"blame\" feature in Git describes the last " +
                "modification to each line of a file, which generally displays the revision, author and time. " +
                "This is helpful, for example, in tracking down when a feature was added, or which commit led to" +
                " a particular bug.");
        Vocab vocab3 = new Vocab("branch", "A branch is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes." );
        Vocab vocab4 = new Vocab("clone", "A clone is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a clone, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you cloned is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.");
        Vocab vocab5 = new Vocab("collaborator", "A collaborator is a person with read and write access to a repository who has been invited to contribute by the repository owner.");
        Vocab vocab6 = new Vocab("commit", "A commit, or \"revision\", is an individual change to a file (or set of files). When you make a commit to save your work, Git creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of the specific changes committed along with who made them and when. Commits usually contain a commit message which is a brief description of what changes were made.");
        Vocab vocab7 = new Vocab("commit message", "Short, descriptive text that accompanies a commit and communicates the change the commit is introducing");
        Vocab vocab8 = new Vocab("contributor", "A contributor is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.");
        Vocab vocab9 = new Vocab("default branch", "The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the default branch.");
        Vocab vocab10 = new Vocab("diff", "A diff is the difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.");
        Vocab vocab11 = new Vocab("feature branch", "A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.");
        Vocab vocab12 = new Vocab("fetch", "When you use git fetch, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, fetching allows you to review changes before committing them to your local branch.");
        Vocab vocab13 = new Vocab("force push", "A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability." );
        Vocab vocab14 = new Vocab("fork", "A fork is a personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your fork synced with the latest changes since both repositories are still connected.");
        Vocab vocab15 = new Vocab("issue", "Issues are suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion thread. You can also categorize an issue with labels and assign it to someone.");
        Vocab vocab16 = new Vocab();
        Vocab vocab17 = new Vocab();
        Vocab vocab18 = new Vocab();
        Vocab vocab19 = new Vocab();
        Vocab vocab20 = new Vocab();
        Vocab vocab21 = new Vocab();
        Vocab vocab22 = new Vocab();
        Vocab vocab23 = new Vocab();
        Vocab vocab24 = new Vocab();
        Vocab vocab25 = new Vocab();
        Vocab vocab26 = new Vocab();
        Vocab vocab27 = new Vocab();



    }










}
