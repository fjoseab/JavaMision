package practicaMultiverse;

public class Main {
    public static void main(String[] args){
        spider();
    }

    private static void spider(){
        Screen screen=new Screen();
        MilesMorales milesMorales= new MilesMorales("Miles Morales","Spider-Man","Alive","My name is Miles Morales. I was bitten by a radioactive spider and for like two days, I've been the one and only Spider-Man. I never thought I'd be able to do any of this stuff, but I can. Anyone can wear the mask. You can wear the mask. If you didn't know that before, I hope you do now.",
                "Spider-Man: Into the Spider-Verse\n" +
                        "Spider-Man: Across the Spider-Verse (Part One)");
        PeterPorker peterPorker = new PeterPorker("Peter Porker", "Spider-Ham", "Alive", "My name is Peter Porker. I was bitten by a radioactive pig. I'm a photographer for the Daily Beagle. When I'm not pooching around, I'm working like a dog trying to sniff out the latest story. I frolic and I dance, and I do this with my pants...",
                "Spider-Man: Into the Spider-Verse");
        PeterParker peterParker = new PeterParker("Peter Benjamin Parker","Peter B. Parker\n" +
                "Spider-Man\n" +
                "Janky\n" +
                "Old broke\n" +
                "Hobo Spider-Man",
                "Alive", "My name is Peter B Parker. I was bitten by a radioactive spider. And for the last twenty-two years, I thought I was the one and only Spider-Man. I’m pretty sure you know the rest. You see, I saved the city, fell in love, I got married, saved the city some more, maybe too much, my marriage got testy, made some dicey money choices, don’t invest in a Spider-themed restaurant. Then like fifteen years passed, blah, blah, blah, super boring, I broke my back, a drone flew into my face, I buried Aunt May, my wife and I split up. But I handled it like a champion. ‘Cause you know what? No matter how many times I get hit, I always get back up. And I got a lot of time to reflect and work on myself. Did you know that seahorses that they mate for life? Could you imagine a seahorse seeing another seahorse and then making it work? She wanted kids and... and it scared me. I'm pretty sure I broke her heart. Flash forward, I'm in my apartment doing push-ups, doing ab crunches, getting strong, when this weird thing happened. And I gotta say, weird things happen to me a lot. But this was real weird. You see, I was in New York, but the things were different. Also, I was dead. And blonde. I was kind of perfect. It was like looking in a mirror. I have a feeling that the thing that brought me here, was the thing that got him killed. You wanna know what happened next? Me too.",
                "Spider-Man: Into the Spider-Verse\n" +
                        "Spider-Man: Across the Spider-Verse (Part One)");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                milesMorales.superhumanStrength(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.superhumanSpeed(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.superhumanAgility(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.spiderSense(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.wallCrawling(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.camouflage(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                milesMorales.venomStrike(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanStrength(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanSpeed(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanReflexes(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanAgility(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.jumpingAbility(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanDurability(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.superhumanStamina(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.healingFactor(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.wallClimber(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterPorker.spiderSense(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanStrength(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanDurability(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanSpeed(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanAgility(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanReflexes(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanEquilibrium(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanJumping(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.superhumanStamina(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.spiderSense(screen);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                peterParker.wallClimber(screen);
            }
        };

        Thread thread=new Thread(runnable);
        thread.start();
    }
}
