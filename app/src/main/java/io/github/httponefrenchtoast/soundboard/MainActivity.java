package io.github.httponefrenchtoast.soundboard;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    public MainActivity () {
        Global G = new Global();
        G.audioActive = false;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView customTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        Typeface metal_font = Typeface.createFromAsset(getApplication().getAssets(), "metal_font.ttf");

        customTitle.setTypeface(metal_font);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Classic"));
        tabLayout.addTab(tabLayout.newTab().setText("Brutal"));
        tabLayout.addTab(tabLayout.newTab().setText("Locke"));
        tabLayout.getTabAt(0).setIcon(R.drawable.logoddm);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    public void clickHandler(View v){

        int id = v.getId();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.bmandiamoavanti);

        if (!Global.G.audioActive) {

            Global.G.audioActive = true;

            switch (id){

                case R.id.button1:
                    mp = MediaPlayer.create(this, R.raw.bmandiamoavanti);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button2:
                    mp = MediaPlayer.create(this, R.raw.bmbrutalmario);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button3:
                    mp = MediaPlayer.create(this, R.raw.bmcapopalestra);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button4:
                    mp = MediaPlayer.create(this, R.raw.bmcazzitua);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button5:
                    mp = MediaPlayer.create(this, R.raw.bmgrandebm);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button6:
                    mp = MediaPlayer.create(this, R.raw.bmhairottoilcazzo);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button7:
                    mp = MediaPlayer.create(this, R.raw.bmkiller);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button8:
                    mp = MediaPlayer.create(this, R.raw.bmperfavore);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button9:
                    mp = MediaPlayer.create(this, R.raw.bmpotenza);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;

                case R.id.button10:
                    mp = MediaPlayer.create(this, R.raw.bmsopravvissuto);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            Global.G.audioActive = false;
                        }
                    });
                    break;


            /*
            *
            *
            *
            *
            *
            *
            case R.id.button11:
                mp = MediaPlayer.create(this, R.raw.rick_sewer);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button12:
                mp = MediaPlayer.create(this, R.raw.rick_shlum);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button13:
                mp = MediaPlayer.create(this, R.raw.morty_die);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button14:
                mp = MediaPlayer.create(this, R.raw.morty_pants);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button15:
                mp = MediaPlayer.create(this, R.raw.morty_together);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button16:
                mp = MediaPlayer.create(this, R.raw.meeseeks_cando);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button17:
                mp = MediaPlayer.create(this, R.raw.meeseeks_lookatme);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button19:
                mp = MediaPlayer.create(this, R.raw.meeseeks_alldie);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button20:
                mp = MediaPlayer.create(this, R.raw.meeseeks_die);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button21:
                mp = MediaPlayer.create(this, R.raw.meeseeks_failures);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button22:
                mp = MediaPlayer.create(this, R.raw.meeseeks_killhim);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button23:
                mp = MediaPlayer.create(this, R.raw.meeseeks_oooo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button24:
                mp = MediaPlayer.create(this, R.raw.meeseeks_shortgame);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button25:
                mp = MediaPlayer.create(this, R.raw.meeseeks_pain);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button26:
                mp = MediaPlayer.create(this, R.raw.terry_aww);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button27:
                mp = MediaPlayer.create(this, R.raw.terry_late);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button28:
                mp = MediaPlayer.create(this, R.raw.terry_pants);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button29:
                mp = MediaPlayer.create(this, R.raw.terry_grades);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button30:
                mp = MediaPlayer.create(this, R.raw.terry_halfs);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button31:
                mp = MediaPlayer.create(this, R.raw.terry_run);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button32:
                mp = MediaPlayer.create(this, R.raw.terry_sex);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button33:
                mp = MediaPlayer.create(this, R.raw.terry_nightmare);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;
            *
            * */



            }



        }





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onContextItemSelected(item);

        switch (item.getItemId()){

            case R.id.pleaseRead:
                Intent i = new Intent(this, PleaseRead.class);
                startActivity(i);
                return true;

            default:
                return false;

        }



    }
}
