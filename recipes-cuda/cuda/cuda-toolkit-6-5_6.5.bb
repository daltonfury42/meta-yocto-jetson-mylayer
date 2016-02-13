SUMMARY = "${PN} ${PV} "
DESCRIPTION = "Add later if you have time."
LICENSE = "CLOSED"

SRC_URI = "file:///run/media/fury/storage/yocto/poky/meta-yocto-jetson-mylayer/recipes-cuda/cuda/cuda-repo-6-5-prod/${PN}_${PV}-42_armhf.deb;subdir=output"

DEPENDS = "cuda-cusparse-dev-6-5 cuda-command-line-tools-6-5 cuda-documentation-6-5 cuda-core-6-5 cuda-driver-dev-6-5 cuda-cublas-6-5 cuda-license-6-5 cuda-cublas-dev-6-5 cuda-minimal-build-6-5 cuda-cudart-6-5 cuda-misc-headers-6-5 cuda-cudart-dev-6-5 cuda-npp-6-5 cuda-cufft-6-5 cuda-npp-dev-6-5 cuda-cufft-dev-6-5 cuda-curand-6-5 cuda-samples-6-5 cuda-curand-dev-6-5 cuda-cusparse-6-5"

S = "${WORKDIR}/output"

inherit bin_package

INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "ldflags"

#FILES_${PN} = "/"

#ALLOW_EMPTY_${PN} = "1"
