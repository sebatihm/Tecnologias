pub mod components;
pub mod prefix;
pub mod builder;

use builder::Builder;

use crate::prefix::*;
use crate::builder::Director;
use crate::components::*;

fn main() {
    let mut builder = PrefixBuilder::default();
    Director::construct_cinnamon(&mut builder);
    let linux = builder.build();
    let mut _a =linux.save_prefix("linux.txt");

    let mut builder2 = PrefixBuilder::default();
    builder2.set_users(vec![User::from("Magdiel", "exodo",true)]);
    builder2.set_language("Spanish");
    builder2.set_kl("en");
    //builder2.set_profile(vec![String::from("Gnome"), String::from("I3")]);
    //builder2.set_host("LASCA");
    builder2.set_swap(true);
    builder2.set_repos(vec![String::from("vim")]);

    let arch = builder2.build();
    _a = arch.save_prefix("arch.txt");
}
