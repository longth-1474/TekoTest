package longhoang.test.teko.di.builder;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import longhoang.test.teko.screen.activity.MainActivity;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {FragmentBuilder.class})
    abstract MainActivity bindMainActivity();
}
