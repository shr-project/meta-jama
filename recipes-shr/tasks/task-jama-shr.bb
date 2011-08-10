DESCRIPTION = "JaMa images extra install"

inherit task

PR = "r12"

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
task-jama \
openmoko-agpsui \
fso-sounds \
fsoraw \
openbmap-logger \
cellhunter \
ffalarms \
#stopwatch \
#wpa-gui \
#paroli \
shr-theme-efenniht \
shr-theme-neo \
"
