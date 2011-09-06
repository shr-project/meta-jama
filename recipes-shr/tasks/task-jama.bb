DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit task

PR = "r25"

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
enjoy \
rtmom \
elmdentica \
"
FAILING = "\
emtooth \
emtooth2 \
navit \
midori \
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

RDEPENDS_${PN} = "\
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
gps-utils \
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
xserver-nodm-init \
watchdog \
spojegui \
openvpn \
kernel-module-tun \
gawk \
make \
syslog-ng \
subversion \
"
