# Automated deployment of the Petstore sample

## Pre-requisites

 * **[Vagrant](https://www.vagrantup.com)**
 * a supported Vagrant hypervisor
 	* **[Virtualbox](https://www.virtualbox.org)** (the default)
 	
### MacOS X

On **MacOS X** (and assuming you have [homebrew](http://brew.sh) already installed) run

```
brew update
brew install wget
```

### Windows

The [vagrant-winnfsd plugin](https://github.com/GM-Alex/vagrant-winnfsd) will be installed in order to enable NFS shares.


##Run automated deployment 
```
./run.sh 
```
It will download and configure CoreOS vagrant boxes and setup Kubernetes 1.1.1 in a 3 CoreOS nodes. Complied product-mss, build all docker files, deploy k8s replication controllers, services ..etc.

```
./clean.sh
```

Clean.sh will clean all k8s resources

```
./petstore.sh
```

Deploy k8s resources for petstore sample.

```
./stop.sh
```
 Clean all k8s resources and stop all CoreOS nodes

## Troubleshooting

#### I'm getting errors while waiting for Kubernetes master to become ready on a MacOS host!

You probably have a pre-existing Kubernetes config file on your system at `~/.kube/config`. Delete or move that file and try again.


