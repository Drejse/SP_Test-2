Studypoint 2 - Test

REFLECTIONS
1.1 COMPUTER MOUSE
Identify the types of testing you would perform on a computer mouse, to make sure
that it is of the highest quality.
Functionality Testing:
Performance Testing
Compatibility Testing
Durability and Reliability Testing
Ergonomics and Usability Testing
Packaging and Transportation Testing
Regulatory Compliance Testing
Visual Testing
User Acceptance Testing
Performance Test

1.2 CATASTROPHIC FAILURE
Find a story where a software system defect had a bad outcome. Describe what
happened. Can you identify a test that would have prevented it? 

In the coastal town of Lumsås in 1982, a fateful missile launch incident occurred due to a software glitch. This event serves as a reminder of the vital role software systems play in our modern world and the potential repercussions of software errors. The Danish Navy's frigate "Peder Skram" was preparing for a NATO exercise at sea. Inexplicably, during a routine missile test, a software malfunction triggered the accidental launch of a 600-kilogram Harpoon missile. The missile's erratic trajectory spared lives but left behind a trail of destruction among unoccupied holiday homes. This incident remains a testament to the need for rigorous software testing and the safeguarding of critical systems against unforeseen software errors.

Given that this incident was due to a glitch, a simulation test with safety overrides could have been employed as a preventive measure. Prior to any live missile test, a comprehensive simulation scenario could have been created. This scenario should mimic the conditions of a missile launch, including all relevant parameters, coordinates, and inputs.

A simulation test, in short, is designed to assess how one would react to situations encountered while working and how one would solve problems.


3.1 JUnit 5
@Tag
Allows you to categorize your test method/classes with a userdefined tag.
Useful for selectively running tests based on their categories/tag.

@Disabled
Makes a test method/class disabled, meaning it won't be executed. Useful when you tempoarily skip a test that may be failing/not yet implemented.

@RepeatedTest
Is used to repeat the execution of a test method x number of times. Useful for testing senarios that need to be repeated x amount of times, to ensure stability or even verify random behaviour.

@BeforeEach, @AfterEach
Both annotations marks methods that are run before and after each test method. Useful for initializing resources before each test and then clean them up afterwards.

@BeforeAll, @AfterAll
Both annotations marks methods that are run once before and after all test methods in a test class. Useful for setting up expensive resources that can be shared across multiple methods - such as initializing a database conenction.

@DisplayName
Allows your to provide a custom name for a test method/class, which is displayed in test reports. Useful for providing descriptive names to your test, making it easier to understand the purpose of each test case.

@Nested
Enables the creation of nested test class with a test class. Useful for making a better and organized test code, by grouping related tests together.

@assumeFalse, @assumeTrue
Allows you to conditionally skip tests based on certain assumptions. Useful for controlling test execution, based on assumptions, making tests more flexible to different enviorments.


3.2 MOCKING FRAMEWORKS 

I java verdenen er der to populære mockning frameworks, Mockito og EasyMock.
- Forskelle og deres potentielle fordele.
Mocking Capabilities:

Både Mockito og EasyMock giver mulighed for at oprette mockobjekter til test. Mockobjekter simulerer adfærden af rigtige objekter for at isolere og verificere opførslen af koden under test.
Metodeinvokationsverifikation:

Begge frameworks tillader dig at verificere, at specifikke metoder på mockobjekter er blevet kaldt med forventede argumenter og i den forventede rækkefølge.
Stubning(placeholder):

Du kan bruge begge frameworks til at stub metodekald på mockobjekter, hvor du angiver, hvilke værdier de skal returnere, eller hvilke undtagelser de skal kaste, når de kaldes.
Annotationer:

Både Mockito og EasyMock giver annotationer for at forenkle testopsætningen, såsom @Mock, @InjectMocks og @RunWith.
Forskelle:

Syntax:

Mockito er kendt for sin renere og mere udtryksfulde syntaks, som mange udviklere finder mere læsbar og nemmere at arbejde med. Det bruger metodekædning til at konfigurere og verificere mockadfærd.
Forventningsindstilling:

EasyMock bruger en mere eksplicit "optag-afspil-verificer"-model, hvor du skal specificere de forventede metodekald i en separat "optag" fase, før du kalder metoderne under test i "afspil" fasen.
Streng vs. Lempelig Mockning:

Mockito bruger lempelig mockning som standard, hvilket giver dig mulighed for at kalde metoder på mockobjekter uden at angive forventninger eksplicit. EasyMock er derimod som standard mere streng og kræver eksplicitte forventningsindstillinger.
Annotationer og Integration:

Mockito giver mere omfattende support til annotationer og integrerer godt med andre test frameworks, som JUnit 4 og JUnit 5. EasyMock understøtter også annotationer, men det kan kræve mere konfiguration i nogle tilfælde.
Præference:

Valget mellem Mockito og EasyMock afhænger ofte af personlig præference og de specifikke krav i dit projekt. Her er nogle overvejelser, der kan hjælpe dig med at beslutte:

Renere syntaks: Mockito foretrækkes generelt for sin mere enkle og læsbare syntaks, hvilket gør det til et fremragende valg for udviklere, der værdsætter kodeklarhed og vedligeholdelighed.

Streng vs. Lempelig: Hvis du foretrækker en streng mockningsramme, der håndhæver mere rigorøse forventninger, kan EasyMock være dit valg.

Eksisterende projektafhængigheder: Overvej den eksisterende testramme og projektopsætning. Mockito integreres problemfrit med JUnit, der er bredt brugt til Java-testning.

Fællesskab og dokumentation: Både Mockito og EasyMock har aktive fællesskaber og omfattende dokumentation, men Mockito kan have en lille fordel i popularitet og ressourcer.

Samlet set er både Mockito og EasyMock fremragende valg for mockning i Java, og din præference kan afhænge af din specifikke kodestil, projektbehov og det testsystem, du arbejder i. Mange udviklere foretrækker Mockito for dens rene og udtryksfulde syntaks, hvilket gør den til et populært valg i Java-fællesskabet.

