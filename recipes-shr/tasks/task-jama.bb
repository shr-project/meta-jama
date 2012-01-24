DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit task

PR = "r33"

PACKAGES = "\
  ${PN} \
"

MISSING = "\
obexpush \
aceofpenguins \
gpsbabel \
intone-video \
links-x11 \
task-cli-tools-python \
dillo2 \
xclock \
twm \
xterm \
podboy \
numptyphysics \
rtmom \
elmdentica \
"
FAILING = "\
emtooth \
"
#shr-settings-addons-illume \
#shr-settings \
#shr-settings-locale-cs \
#woosh \
#eglibc-locale-cs \
#shr-settings-locale-cs \
#eglibc-locale-cs \
#shr-settings-locale-cs \
#tangogps-locale-cs \
#pisi \
#orrery \
#omgps \
#shr-launcher \
#navit-locale-cs \
#neote \
#ventura \
#task-e-x11 \
#util-linux-ng \
#
#task-shr-apps \

# removed, brings udev
#gps-utils 

RDEPENDS_${PN} = "\
epdfview \
fbreader \
enjoy \
mplayer2 \
intone \
navit \
enjoy \
epdfview \
midori \
emtooth2 \
bash \
screen \
advancedcaching \
mcnavi \
tangogps \
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
task-cli-tools \
task-cli-tools-debug \
babiloo-efl \
xinit \
xinput-calibrator \
watchdog \
spojegui \
openvpn \
kernel-module-tun \
gawk \
make \
subversion \
"
