DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup allarch

PR = "r38"

RPROVIDES_${PN} += "task-jama"
RREPLACES_${PN} += "task-jama"
RCONFLICTS_${PN} += "task-jama"

PACKAGES = "\
  ${PN} \
"

MISSING = "\
obexpush \
aceofpenguins \
gpsbabel \
intone-video \
links-x11 \
packagegroup-cli-tools-python \
dillo2 \
xclock \
twm \
xterm \
podboy \
numptyphysics \
rtmom \
elmdentica \
elfe \
"
FAILING = "\
emtooth \
"
#shr-settings-addons-illume 
#shr-settings 
#shr-settings-locale-cs 
#woosh 
#eglibc-locale-cs 
#shr-settings-locale-cs 
#eglibc-locale-cs 
#shr-settings-locale-cs 
#tangogps-locale-cs 
#pisi 
#orrery 
#omgps 
#shr-launcher 
#navit-locale-cs 
#neote 
#ventura 
#packagegroup-e-x11 
#util-linux-ng 
#
#packagegroup-shr-apps 

# removed, brings udev
#gps-utils 
#epdfview

RDEPENDS_${PN} = "\
rfkill \
fbreader \
enjoy \
mplayer2 \
intone \
enjoy \
emtooth2 \
bash \
screen \
advancedcaching \
mcnavi \
fuser \
time \
sysstat \
tcpdump \
psmisc \
lsof \
htop \
findutils \
coreutils \
om-neon \
vim \
strace \
tzdata-europe \
dosfstools \
grep \
powertop \
tar \
packagegroup-cli-tools \
packagegroup-cli-tools-debug \
babiloo-efl \
xinit \
xinput-calibrator \
watchdog \
spojegui \
openvpn \
gawk \
make \
subversion \
"
RRECOMMENDS_${PN} = "\
  kernel-module-tun \
"
