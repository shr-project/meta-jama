DESCRIPTION = "JaMa images extra install"

inherit task

PR = "r23"

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
bash \
navit \
screen \
elmdentica \
advancedcaching \
tangogps \
fuser \
#shr-settings-addons-illume \
#shr-settings \
#shr-settings-locale-cs \
#woosh \
time \
sysstat \
tcpdump \
psmisc \
#pisi \
#orrery \
lsof \
htop \
gps-utils \
gpsbabel \
findutils \
#eglibc-locale-cs \
#shr-settings-locale-cs \
#eglibc-locale-cs \
#shr-settings-locale-cs \
#tangogps-locale-cs \
obexpush \
aceofpenguins \
coreutils \
#navit-locale-cs \
om-neon \
#omgps \
numptyphysics \
vim \
#shr-launcher \
strace \
tzdata-europe \
intone-video \
dosfstools \
grep \
links-x11 \
subversion \
#neote \
powertop \
tar \
task-cli-tools \
task-cli-tools-debug \
task-cli-tools-python \
#task-shr-apps \
babiloo-efl \
rtmom \
dillo2 \
emtooth \
emtooth2 \
podboy \
#ventura \
#task-e-x11 \
xinit \
#util-linux-ng \
xinput-calibrator \
xclock \
twm \
xterm \
xserver-nodm-init \
watchdog \
spojegui \
midori \
openvpn \
kernel-module-tun \
gawk \
make \
syslog-ng \
enjoy \
"
